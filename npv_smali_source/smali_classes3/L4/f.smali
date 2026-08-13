.class public abstract LL4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL4/f$b;,
        LL4/f$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)LL4/c;
    .locals 0

    invoke-static {p0}, Lf4/a;->a(Landroid/content/Context;)Lf4/a;

    move-result-object p0

    invoke-virtual {p0}, Lf4/a;->b()Lf4/c1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/app/Activity;LL4/b$a;)V
    .locals 2

    .prologue
    invoke-static {p0}, Lf4/a;->a(Landroid/content/Context;)Lf4/a;

    move-result-object v0

    invoke-virtual {v0}, Lf4/a;->b()Lf4/c1;

    move-result-object v0

    invoke-virtual {v0}, Lf4/c1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    invoke-interface {p1, p0}, LL4/b$a;->a(LL4/e;)V

    return-void

    :cond_0
    invoke-static {p0}, Lf4/a;->a(Landroid/content/Context;)Lf4/a;

    move-result-object v0

    invoke-virtual {v0}, Lf4/a;->c()Lf4/P;

    move-result-object v0

    invoke-static {}, Lf4/v0;->a()V

    new-instance v1, Lf4/N;

    invoke-direct {v1, p0, p1}, Lf4/N;-><init>(Landroid/app/Activity;LL4/b$a;)V

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lf4/O;

    invoke-direct {p0, p1}, Lf4/O;-><init>(LL4/b$a;)V

    invoke-virtual {v0, v1, p0}, Lf4/P;->b(LL4/f$b;LL4/f$a;)V

    return-void
.end method

.method public static c(Landroid/app/Activity;LL4/b$a;)V
    .locals 1

    invoke-static {p0}, Lf4/a;->a(Landroid/content/Context;)Lf4/a;

    move-result-object v0

    invoke-virtual {v0}, Lf4/a;->c()Lf4/P;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lf4/P;->e(Landroid/app/Activity;LL4/b$a;)V

    return-void
.end method
