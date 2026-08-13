.class public abstract Le0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)Le0/d;
    .locals 7

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)"

    const v2, 0xebd1ab

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x2f7337b1

    invoke-interface {p0, p1}, LV/n;->T(I)V

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    sget-object p1, Le0/e;->d:Le0/e$c;

    invoke-virtual {p1}, Le0/e$c;->a()Le0/j;

    move-result-object v1

    sget-object v3, Le0/f$a;->D:Le0/f$a;

    const/16 v5, 0xc00

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le0/e;

    invoke-static {}, Le0/i;->d()LV/O0;

    move-result-object v0

    invoke-interface {p0, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le0/g;

    invoke-virtual {p1, v0}, Le0/e;->i(Le0/g;)V

    invoke-interface {p0}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
