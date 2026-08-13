.class public final synthetic Lg3/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/M$d;


# instance fields
.field public final synthetic a:Lg3/W;


# direct methods
.method public synthetic constructor <init>(Lg3/W;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/E;->a:Lg3/W;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg3/E;->a:Lg3/W;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method
