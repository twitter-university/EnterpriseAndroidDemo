/* $Id: $
   Copyright 2012, G. Blake Meike

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package net.callmeike.android.enterprise.db;

import android.content.ContentResolver;


/**
 *
 * @version $Revision: $
 * @author <a href="mailto:blake.meike@gmail.com">G. Blake Meike</a>
 */
public class EAContract {
    public static final String AUTHORITY = "net.callmeike.android.enterprise";

    public static final String TYPE_DIR
        = ContentResolver.CURSOR_DIR_BASE_TYPE
            + "/vnd.com.enterpriseandroid.database.val";
    public static final String TYPE_ITEM
        = ContentResolver.CURSOR_ITEM_BASE_TYPE
            + "/vnd.com.enterpriseandroid.database.val";

    public static final String TABLE = "ea";

    public static final class Columns {
        public static final String ID = "id";
        public static final String COL1 = "col1";
        public static final String COLN = "colN";
    }
}
