.class public abstract LR0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;)LR0/h$b;
    .locals 9

    new-instance v8, LR0/j;

    new-instance v1, LR0/a;

    invoke-direct {v1, p0}, LR0/a;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, LR0/c;->a(Landroid/content/Context;)LR0/b;

    move-result-object v2

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LR0/j;-><init>(LR0/w;LR0/y;LR0/G;LR0/m;LR0/v;ILy7/k;)V

    return-object v8
.end method
