.class final LA2/d$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA2/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lz2/e$a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA2/d;


# direct methods
.method constructor <init>(LA2/d;)V
    .locals 0

    iput-object p1, p0, LA2/d$d;->D:LA2/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LA2/d$c;
    .locals 17

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->i(LA2/d;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->o(LA2/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    iget-object v3, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v3}, LA2/d;->g(LA2/d;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lz2/b;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    iget-object v4, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v4}, LA2/d;->i(LA2/d;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, LA2/d$c;

    iget-object v4, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v4}, LA2/d;->g(LA2/d;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    new-instance v8, LA2/d$b;

    invoke-direct {v8, v2}, LA2/d$b;-><init>(LA2/c;)V

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->f(LA2/d;)Lz2/e$a;

    move-result-object v9

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->a(LA2/d;)Z

    move-result v10

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, LA2/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;LA2/d$b;Lz2/e$a;Z)V

    goto :goto_0

    :cond_0
    new-instance v3, LA2/d$c;

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->g(LA2/d;)Landroid/content/Context;

    move-result-object v12

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->i(LA2/d;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, LA2/d$b;

    invoke-direct {v14, v2}, LA2/d$b;-><init>(LA2/c;)V

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->f(LA2/d;)Lz2/e$a;

    move-result-object v15

    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->a(LA2/d;)Z

    move-result v16

    move-object v11, v3

    invoke-direct/range {v11 .. v16}, LA2/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;LA2/d$b;Lz2/e$a;Z)V

    :goto_0
    iget-object v1, v0, LA2/d$d;->D:LA2/d;

    invoke-static {v1}, LA2/d;->r(LA2/d;)Z

    move-result v1

    invoke-virtual {v3, v1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    return-object v3
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA2/d$d;->a()LA2/d$c;

    move-result-object v0

    return-object v0
.end method
