.class final LC/n$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/n;->a(LC/K;Lx7/l;LV/n;I)Lx7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;

.field final synthetic E:LC/K;


# direct methods
.method constructor <init>(LV/G1;LC/K;)V
    .locals 0

    iput-object p1, p0, LC/n$c;->D:LV/G1;

    iput-object p2, p0, LC/n$c;->E:LC/K;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC/m;
    .locals 4

    iget-object v0, p0, LC/n$c;->D:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/j;

    new-instance v1, LD/J;

    iget-object v2, p0, LC/n$c;->E:LC/K;

    invoke-virtual {v2}, LC/K;->t()LE7/i;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LD/J;-><init>(LE7/i;LD/o;)V

    new-instance v2, LC/m;

    iget-object v3, p0, LC/n$c;->E:LC/K;

    invoke-direct {v2, v3, v0, v1}, LC/m;-><init>(LC/K;LC/j;Landroidx/compose/foundation/lazy/layout/c;)V

    return-object v2
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/n$c;->a()LC/m;

    move-result-object v0

    return-object v0
.end method
