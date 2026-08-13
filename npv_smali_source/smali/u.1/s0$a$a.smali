.class public final Lu/s0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/s0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final C:Lu/s0$d;

.field private D:Lx7/l;

.field private E:Lx7/l;

.field final synthetic F:Lu/s0$a;


# direct methods
.method public constructor <init>(Lu/s0$a;Lu/s0$d;Lx7/l;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lu/s0$a$a;->F:Lu/s0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu/s0$a$a;->C:Lu/s0$d;

    iput-object p3, p0, Lu/s0$a$a;->D:Lx7/l;

    iput-object p4, p0, Lu/s0$a$a;->E:Lx7/l;

    return-void
.end method


# virtual methods
.method public final e()Lu/s0$d;
    .locals 1

    iget-object v0, p0, Lu/s0$a$a;->C:Lu/s0$d;

    return-object v0
.end method

.method public final g()Lx7/l;
    .locals 1

    iget-object v0, p0, Lu/s0$a$a;->E:Lx7/l;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/s0$a$a;->F:Lu/s0$a;

    iget-object v0, v0, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lu/s0$a$a;->r(Lu/s0$b;)V

    iget-object v0, p0, Lu/s0$a$a;->C:Lu/s0$d;

    invoke-virtual {v0}, Lu/s0$d;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lx7/l;
    .locals 1

    iget-object v0, p0, Lu/s0$a$a;->D:Lx7/l;

    return-object v0
.end method

.method public final o(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lu/s0$a$a;->E:Lx7/l;

    return-void
.end method

.method public final q(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lu/s0$a$a;->D:Lx7/l;

    return-void
.end method

.method public final r(Lu/s0$b;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lu/s0$a$a;->E:Lx7/l;

    invoke-interface {p1}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lu/s0$a$a;->F:Lu/s0$a;

    iget-object v1, v1, Lu/s0$a;->d:Lu/s0;

    invoke-virtual {v1}, Lu/s0;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lu/s0$a$a;->E:Lx7/l;

    invoke-interface {p1}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lu/s0$a$a;->C:Lu/s0$d;

    iget-object v3, p0, Lu/s0$a$a;->D:Lx7/l;

    invoke-interface {v3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/I;

    invoke-virtual {v2, v1, v0, p1}, Lu/s0$d;->I(Ljava/lang/Object;Ljava/lang/Object;Lu/I;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lu/s0$a$a;->C:Lu/s0$d;

    iget-object v2, p0, Lu/s0$a$a;->D:Lx7/l;

    invoke-interface {v2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/I;

    invoke-virtual {v1, v0, p1}, Lu/s0$d;->K(Ljava/lang/Object;Lu/I;)V

    :goto_0
    return-void
.end method
