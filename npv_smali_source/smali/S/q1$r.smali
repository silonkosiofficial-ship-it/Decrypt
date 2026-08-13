.class final LS/q1$r;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->m(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/t1;


# direct methods
.method constructor <init>(LS/t1;)V
    .locals 0

    iput-object p1, p0, LS/q1$r;->D:LS/t1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LS/q1$r;->D:LS/t1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LS/t1;->c(Z)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/q1$r;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
