.class public abstract Le0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;Lx7/l;)Le0/j;
    .locals 1

    new-instance v0, Le0/a$a;

    invoke-direct {v0, p0}, Le0/a$a;-><init>(Lx7/p;)V

    const-string p0, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>"

    invoke-static {p1, p0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-static {p1, p0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/l;

    invoke-static {v0, p0}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object p0

    return-object p0
.end method
