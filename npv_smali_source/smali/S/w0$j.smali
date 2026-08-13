.class final LS/w0$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->d(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/p;

.field final synthetic H:Z

.field final synthetic I:Lx7/a;

.field final synthetic J:I


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;I)V
    .locals 0

    iput-object p1, p0, LS/w0$j;->D:Lx7/p;

    iput-object p2, p0, LS/w0$j;->E:Lx7/p;

    iput-object p3, p0, LS/w0$j;->F:Lx7/p;

    iput-object p4, p0, LS/w0$j;->G:Lx7/p;

    iput-boolean p5, p0, LS/w0$j;->H:Z

    iput-object p6, p0, LS/w0$j;->I:Lx7/a;

    iput p7, p0, LS/w0$j;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    iget-object v0, p0, LS/w0$j;->D:Lx7/p;

    iget-object v1, p0, LS/w0$j;->E:Lx7/p;

    iget-object v2, p0, LS/w0$j;->F:Lx7/p;

    iget-object v3, p0, LS/w0$j;->G:Lx7/p;

    iget-boolean v4, p0, LS/w0$j;->H:Z

    iget-object v5, p0, LS/w0$j;->I:Lx7/a;

    iget p2, p0, LS/w0$j;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    move-object v6, p1

    invoke-static/range {v0 .. v7}, LS/w0;->f(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/w0$j;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
