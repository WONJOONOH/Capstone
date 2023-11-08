package org.techtown.a1023_food_guard;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDao_Impl implements FoodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Food> __insertionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __deletionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __updateAdapterOfFood;

  private final SharedSQLiteStatement __preparedStmtOfDeleteId;

  public FoodDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFood = new EntityInsertionAdapter<Food>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Food` (`id`,`name`,`kcal`,`sugar`,`tansuhwamul`,`salt`,`protein`,`fat`,`remain_food`,`deadline`,`barcode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final Food entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getKcal() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getKcal());
        }
        if (entity.getSugar() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getSugar());
        }
        if (entity.getTansuhwamul() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getTansuhwamul());
        }
        if (entity.getSalt() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSalt());
        }
        if (entity.getProtein() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getProtein());
        }
        if (entity.getFat() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getFat());
        }
        if (entity.getRemain_food() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getRemain_food());
        }
        if (entity.getDeadline() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getDeadline());
        }
        if (entity.getBarcode() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getBarcode());
        }
      }
    };
    this.__deletionAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Food` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final Food entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Food` SET `id` = ?,`name` = ?,`kcal` = ?,`sugar` = ?,`tansuhwamul` = ?,`salt` = ?,`protein` = ?,`fat` = ?,`remain_food` = ?,`deadline` = ?,`barcode` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final Food entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getKcal() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getKcal());
        }
        if (entity.getSugar() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getSugar());
        }
        if (entity.getTansuhwamul() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getTansuhwamul());
        }
        if (entity.getSalt() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSalt());
        }
        if (entity.getProtein() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getProtein());
        }
        if (entity.getFat() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getFat());
        }
        if (entity.getRemain_food() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getRemain_food());
        }
        if (entity.getDeadline() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getDeadline());
        }
        if (entity.getBarcode() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getBarcode());
        }
        statement.bindLong(12, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Food WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void setInsertFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFood.insert(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setDeleteFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFood.handle(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setUpdateFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFood.handle(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteId(final int foodId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, foodId);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteId.release(_stmt);
    }
  }

  @Override
  public List<Food> getFoodAll() {
    final String _sql = "SELECT * FROM Food";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
      final int _cursorIndexOfSugar = CursorUtil.getColumnIndexOrThrow(_cursor, "sugar");
      final int _cursorIndexOfTansuhwamul = CursorUtil.getColumnIndexOrThrow(_cursor, "tansuhwamul");
      final int _cursorIndexOfSalt = CursorUtil.getColumnIndexOrThrow(_cursor, "salt");
      final int _cursorIndexOfProtein = CursorUtil.getColumnIndexOrThrow(_cursor, "protein");
      final int _cursorIndexOfFat = CursorUtil.getColumnIndexOrThrow(_cursor, "fat");
      final int _cursorIndexOfRemainFood = CursorUtil.getColumnIndexOrThrow(_cursor, "remain_food");
      final int _cursorIndexOfDeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "deadline");
      final int _cursorIndexOfBarcode = CursorUtil.getColumnIndexOrThrow(_cursor, "barcode");
      final List<Food> _result = new ArrayList<Food>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Food _item;
        _item = new Food();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final String _tmpKcal;
        if (_cursor.isNull(_cursorIndexOfKcal)) {
          _tmpKcal = null;
        } else {
          _tmpKcal = _cursor.getString(_cursorIndexOfKcal);
        }
        _item.setKcal(_tmpKcal);
        final String _tmpSugar;
        if (_cursor.isNull(_cursorIndexOfSugar)) {
          _tmpSugar = null;
        } else {
          _tmpSugar = _cursor.getString(_cursorIndexOfSugar);
        }
        _item.setSugar(_tmpSugar);
        final String _tmpTansuhwamul;
        if (_cursor.isNull(_cursorIndexOfTansuhwamul)) {
          _tmpTansuhwamul = null;
        } else {
          _tmpTansuhwamul = _cursor.getString(_cursorIndexOfTansuhwamul);
        }
        _item.setTansuhwamul(_tmpTansuhwamul);
        final String _tmpSalt;
        if (_cursor.isNull(_cursorIndexOfSalt)) {
          _tmpSalt = null;
        } else {
          _tmpSalt = _cursor.getString(_cursorIndexOfSalt);
        }
        _item.setSalt(_tmpSalt);
        final String _tmpProtein;
        if (_cursor.isNull(_cursorIndexOfProtein)) {
          _tmpProtein = null;
        } else {
          _tmpProtein = _cursor.getString(_cursorIndexOfProtein);
        }
        _item.setProtein(_tmpProtein);
        final String _tmpFat;
        if (_cursor.isNull(_cursorIndexOfFat)) {
          _tmpFat = null;
        } else {
          _tmpFat = _cursor.getString(_cursorIndexOfFat);
        }
        _item.setFat(_tmpFat);
        final String _tmpRemain_food;
        if (_cursor.isNull(_cursorIndexOfRemainFood)) {
          _tmpRemain_food = null;
        } else {
          _tmpRemain_food = _cursor.getString(_cursorIndexOfRemainFood);
        }
        _item.setRemain_food(_tmpRemain_food);
        final String _tmpDeadline;
        if (_cursor.isNull(_cursorIndexOfDeadline)) {
          _tmpDeadline = null;
        } else {
          _tmpDeadline = _cursor.getString(_cursorIndexOfDeadline);
        }
        _item.setDeadline(_tmpDeadline);
        final String _tmpBarcode;
        if (_cursor.isNull(_cursorIndexOfBarcode)) {
          _tmpBarcode = null;
        } else {
          _tmpBarcode = _cursor.getString(_cursorIndexOfBarcode);
        }
        _item.setBarcode(_tmpBarcode);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getDataCount() {
    final String _sql = "SELECT COUNT(*) FROM Food";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getidtocalc(final String deadlineValue) {
    final String _sql = "SELECT id FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getkcaltocalc(final String deadlineValue) {
    final String _sql = "SELECT kcal FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getsugartocalc(final String deadlineValue) {
    final String _sql = "SELECT sugar FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String gettansuhwamultocalc(final String deadlineValue) {
    final String _sql = "SELECT tansuhwamul FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getsalttocalc(final String deadlineValue) {
    final String _sql = "SELECT salt FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getproteintocalc(final String deadlineValue) {
    final String _sql = "SELECT protein FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getfattocalc(final String deadlineValue) {
    final String _sql = "SELECT fat FROM Food WHERE deadline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (deadlineValue == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, deadlineValue);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
