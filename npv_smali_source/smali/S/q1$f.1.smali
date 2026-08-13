.class final LS/q1$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->c(LS/c;LS/o1;ZLV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/c;

.field final synthetic E:LS/o1;

.field final synthetic F:Z

.field final synthetic G:I


# direct methods
.method constructor <init>(LS/c;LS/o1;ZI)V
    .locals 0

    iput-object p1, p0, LS/q1$f;->D:LS/c;

    iput-object p2, p0, LS/q1$f;->E:LS/o1;

    iput-boolean p3, p0, LS/q1$f;->F:Z

    iput p4, p0, LS/q1$f;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 3

    iget-object p2, p0, LS/q1$f;->D:LS/c;

    iget-object v0, p0, LS/q1$f;->E:LS/o1;

    iget-boolean v1, p0, LS/q1$f;->F:Z

    iget v2, p0, LS/q1$f;->G:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LV/S0;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, LS/q1;->c(LS/c;LS/o1;ZLV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
