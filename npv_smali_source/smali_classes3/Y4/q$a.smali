.class LY4/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY4/q;-><init>(Landroid/content/Context;LY4/k;LZ4/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LY4/k;

.field final synthetic b:LZ4/a;

.field final synthetic c:LY4/q;


# direct methods
.method constructor <init>(LY4/q;LY4/k;LZ4/a;)V
    .locals 0

    iput-object p1, p0, LY4/q$a;->c:LY4/q;

    iput-object p2, p0, LY4/q$a;->a:LY4/k;

    iput-object p3, p0, LY4/q$a;->b:LZ4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .prologue
    iget-object v0, p0, LY4/q$a;->c:LY4/q;

    invoke-static {v0, p1}, LY4/q;->a(LY4/q;Z)Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LY4/q$a;->a:LY4/k;

    invoke-virtual {p1}, LY4/k;->c()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LY4/q$a;->c:LY4/q;

    invoke-static {p1}, LY4/q;->b(LY4/q;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LY4/q$a;->a:LY4/k;

    iget-object v0, p0, LY4/q$a;->c:LY4/q;

    invoke-static {v0}, LY4/q;->c(LY4/q;)J

    move-result-wide v0

    iget-object v2, p0, LY4/q$a;->b:LZ4/a;

    invoke-interface {v2}, LZ4/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, LY4/k;->g(J)V

    :cond_1
    :goto_0
    return-void
.end method
