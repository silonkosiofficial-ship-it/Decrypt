.class Landroidx/work/impl/WorkDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/e$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->P(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/impl/WorkDatabase$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lz2/e$b;)Lz2/e;
    .locals 2

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lz2/e$b;->a(Landroid/content/Context;)Lz2/e$b$a;

    move-result-object v0

    iget-object v1, p1, Lz2/e$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lz2/e$b$a;->c(Ljava/lang/String;)Lz2/e$b$a;

    move-result-object v1

    iget-object p1, p1, Lz2/e$b;->c:Lz2/e$a;

    invoke-virtual {v1, p1}, Lz2/e$b$a;->b(Lz2/e$a;)Lz2/e$b$a;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lz2/e$b$a;->d(Z)Lz2/e$b$a;

    new-instance p1, LA2/f;

    invoke-direct {p1}, LA2/f;-><init>()V

    invoke-virtual {v0}, Lz2/e$b$a;->a()Lz2/e$b;

    move-result-object v0

    invoke-virtual {p1, v0}, LA2/f;->a(Lz2/e$b;)Lz2/e;

    move-result-object p1

    return-object p1
.end method
