package com.smc.utils.excel2007;

import java.util.List;

public interface IRowReader {

    Object getRowData(int sheetNo, int curRow, List<String> rowlist);

    String getErrorMessage();

    void checkCellInfo(int sheetNo, int curRow, List<String> rowData);

    void setDataTime(String dataTime);

    String getDataTime();
}
