.class public final Lu/S$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private C:Ljava/lang/Object;

.field private D:Ljava/lang/Object;

.field private final E:Lu/x0;

.field private final F:Ljava/lang/String;

.field private final G:LV/w0;

.field private H:Lu/j;

.field private I:Lu/r0;

.field private J:Z

.field private K:Z

.field private L:J

.field final synthetic M:Lu/S;


# direct methods
.method public constructor <init>(Lu/S;Ljava/lang/Object;Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/String;)V
    .locals 8

    iput-object p1, p0, Lu/S$a;->M:Lu/S;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu/S$a;->C:Ljava/lang/Object;

    iput-object p3, p0, Lu/S$a;->D:Ljava/lang/Object;

    iput-object p4, p0, Lu/S$a;->E:Lu/x0;

    iput-object p6, p0, Lu/S$a;->F:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p3, 0x2

    invoke-static {p2, p1, p3, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lu/S$a;->G:LV/w0;

    iput-object p5, p0, Lu/S$a;->H:Lu/j;

    new-instance p1, Lu/r0;

    iget-object v1, p0, Lu/S$a;->H:Lu/j;

    iget-object v3, p0, Lu/S$a;->C:Ljava/lang/Object;

    iget-object v4, p0, Lu/S$a;->D:Ljava/lang/Object;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, p4

    invoke-direct/range {v0 .. v7}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;ILy7/k;)V

    iput-object p1, p0, Lu/S$a;->I:Lu/r0;

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/S$a;->C:Ljava/lang/Object;

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/S$a;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/S$a;->G:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lu/S$a;->J:Z

    return v0
.end method

.method public final o(J)V
    .locals 2

    .prologue
    iget-object v0, p0, Lu/S$a;->M:Lu/S;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lu/S;->d(Lu/S;Z)V

    iget-boolean v0, p0, Lu/S$a;->K:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lu/S$a;->K:Z

    iput-wide p1, p0, Lu/S$a;->L:J

    :cond_0
    iget-wide v0, p0, Lu/S$a;->L:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lu/S$a;->I:Lu/r0;

    invoke-virtual {v0, p1, p2}, Lu/r0;->f(J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lu/S$a;->r(Ljava/lang/Object;)V

    iget-object v0, p0, Lu/S$a;->I:Lu/r0;

    invoke-virtual {v0, p1, p2}, Lu/r0;->e(J)Z

    move-result p1

    iput-boolean p1, p0, Lu/S$a;->J:Z

    return-void
.end method

.method public final q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu/S$a;->K:Z

    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/S$a;->G:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lu/S$a;->I:Lu/r0;

    invoke-virtual {v0}, Lu/r0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lu/S$a;->r(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu/S$a;->K:Z

    return-void
.end method

.method public final t(Ljava/lang/Object;Ljava/lang/Object;Lu/j;)V
    .locals 9

    iput-object p1, p0, Lu/S$a;->C:Ljava/lang/Object;

    iput-object p2, p0, Lu/S$a;->D:Ljava/lang/Object;

    iput-object p3, p0, Lu/S$a;->H:Lu/j;

    new-instance v8, Lu/r0;

    iget-object v2, p0, Lu/S$a;->E:Lu/x0;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p3

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;ILy7/k;)V

    iput-object v8, p0, Lu/S$a;->I:Lu/r0;

    iget-object p1, p0, Lu/S$a;->M:Lu/S;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lu/S;->d(Lu/S;Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu/S$a;->J:Z

    iput-boolean p2, p0, Lu/S$a;->K:Z

    return-void
.end method
