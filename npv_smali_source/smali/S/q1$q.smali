.class final LS/q1$q;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->m(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LS/q1$q;->D:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, LK0/u;->k0(LK0/w;Z)V

    iget-object v0, p0, LS/q1$q;->D:Ljava/lang/String;

    invoke-static {p1, v0}, LK0/u;->O(LK0/w;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/q1$q;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
