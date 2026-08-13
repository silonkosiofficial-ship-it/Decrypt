.class public abstract LV8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Z)LV8/a;
    .locals 1

    sget-object v0, LV8/d$a;->a:LV8/d$a;

    invoke-static {p0, v0}, LV8/b;->b(ZLV8/d;)LV8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZLV8/d;)LV8/a;
    .locals 1

    const-string v0, "trace"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/a;

    invoke-direct {v0, p0, p1}, LV8/a;-><init>(ZLV8/d;)V

    return-object v0
.end method

.method public static final c(I)LV8/c;
    .locals 1

    sget-object v0, LV8/d$a;->a:LV8/d$a;

    invoke-static {p0, v0}, LV8/b;->d(ILV8/d;)LV8/c;

    move-result-object p0

    return-object p0
.end method

.method public static final d(ILV8/d;)LV8/c;
    .locals 1

    const-string v0, "trace"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/c;

    invoke-direct {v0, p0, p1}, LV8/c;-><init>(ILV8/d;)V

    return-object v0
.end method
