.class final Le0/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/b;->c(Le0/j;)Le0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le0/j;


# direct methods
.method constructor <init>(Le0/j;)V
    .locals 0

    iput-object p1, p0, Le0/b$a;->D:Le0/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LV/w0;)LV/w0;
    .locals 2

    .prologue
    instance-of v0, p2, Lf0/q;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le0/b$a;->D:Le0/j;

    invoke-interface {p2}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Le0/j;->b(Le0/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p2, Lf0/q;

    invoke-interface {p2}, Lf0/q;->c()LV/u1;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LV/w0;

    invoke-virtual {p0, p1, p2}, Le0/b$a;->a(Le0/l;LV/w0;)LV/w0;

    move-result-object p1

    return-object p1
.end method
