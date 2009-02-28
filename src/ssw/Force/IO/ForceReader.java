/*
Copyright (c) 2008, George Blouin Jr. (skyhigh@solaris7.com)
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are
permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice, this list of
conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice, this list
of conditions and the following disclaimer in the documentation and/or other materials
provided with the distribution.
    * Neither the name of George Blouin Jr nor the names of contributors may be
used to endorse or promote products derived from this software without specific prior
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package ssw.Force.IO;

import java.io.File;
import javax.swing.JFileChooser;
import ssw.Force.*;
import ssw.Force.Common.CommonTools;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class ForceReader {

    public Force Load() {
        Force loadedForce = new Force();

        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new javax.swing.filechooser.FileFilter() {

                @Override
                public boolean accept(File f) {
                    if (f.isDirectory()){
                        return true;
                    }

                    if (f.getName().indexOf(".") > 0) {
                        String extension = "" + f.getName().substring(f.getName().indexOf("."));
                        if (extension.equals(".xml")){
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }

                @Override
                public String getDescription() {
                    return "*.xml";
                }
            });
         fc.setAcceptAllFileFilterUsed( false );
         //fc.setCurrentDirectory(tempFile);
         int returnVal = fc.showDialog( null, "Load Force List" );
           if( returnVal != JFileChooser.APPROVE_OPTION ) { return loadedForce; }
           File ForceFile = fc.getSelectedFile();
           String filename = "";
           try {
               filename = ForceFile.getCanonicalPath();
               return ReadFile(filename);
           } catch( Exception e ) {
               javax.swing.JOptionPane.showMessageDialog( null, "There was a problem opening the file:\n" + e.getMessage() );
               return loadedForce;
           }
    }

    public Force ReadFile( String filename ) throws Exception {
        Document load;
        filename = CommonTools.SafeFileName( filename );

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        load = db.parse( filename );
        NodeList n = load.getElementsByTagName("force");

        return new Force(n.item(0));
    }
}