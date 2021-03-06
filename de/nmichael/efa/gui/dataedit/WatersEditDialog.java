/**
 * Title:        efa - elektronisches Fahrtenbuch für Ruderer
 * Copyright:    Copyright (c) 2001-2011 by Nicolas Michael
 * Website:      http://efa.nmichael.de/
 * License:      GNU General Public License v2
 *
 * @author Nicolas Michael
 * @version 2
 */

package de.nmichael.efa.gui.dataedit;

import de.nmichael.efa.core.config.AdminRecord;
import de.nmichael.efa.util.*;
import de.nmichael.efa.data.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// @i18n complete
public class WatersEditDialog extends UnversionizedDataEditDialog {

    public WatersEditDialog(Frame parent, WatersRecord r, boolean newRecord, AdminRecord admin) {
        super(parent, International.getString("Gewässer"), r, newRecord, admin);
        ini4Permissions(admin);
    }

    public WatersEditDialog(JDialog parent, WatersRecord r, boolean newRecord, AdminRecord admin) {
        super(parent, International.getString("Gewässer"), r, newRecord, admin);
        ini4Permissions(admin);
    }

    public void keyAction(ActionEvent evt) {
        _keyAction(evt);
    }

    private void ini4Permissions(AdminRecord admin) {
        if (admin != null && !admin.isAllowedEditDestinations()) {
            setForbidChanges();
        }
    }

}
