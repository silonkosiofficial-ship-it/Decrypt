.class final LS/q1$z;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->q(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, LS/q1$z;->D:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 1

    iget-boolean v0, p0, LS/q1$z;->D:Z

    invoke-static {p1, v0}, LK0/u;->Y(LK0/w;Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/q1$z;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
