.class public final synthetic LA2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:Lz2/e$a;

.field public final synthetic b:LA2/d$b;


# direct methods
.method public synthetic constructor <init>(Lz2/e$a;LA2/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA2/e;->a:Lz2/e$a;

    iput-object p2, p0, LA2/e;->b:LA2/d$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, LA2/e;->a:Lz2/e$a;

    iget-object v1, p0, LA2/e;->b:LA2/d$b;

    invoke-static {v0, v1, p1}, LA2/d$c;->a(Lz2/e$a;LA2/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
