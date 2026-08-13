.class public abstract Lz0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Landroidx/compose/ui/viewinterop/c;)Landroidx/compose/ui/d;
    .locals 2

    new-instance v0, Lz0/L;

    invoke-direct {v0}, Lz0/L;-><init>()V

    new-instance v1, Lz0/M$a;

    invoke-direct {v1, p1}, Lz0/M$a;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    invoke-virtual {v0, v1}, Lz0/L;->m(Lx7/l;)V

    new-instance v1, Lz0/T;

    invoke-direct {v1}, Lz0/T;-><init>()V

    invoke-virtual {v0, v1}, Lz0/L;->n(Lz0/T;)V

    invoke-virtual {p1, v1}, Landroidx/compose/ui/viewinterop/c;->setOnRequestDisallowInterceptTouchEvent$ui_release(Lx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
