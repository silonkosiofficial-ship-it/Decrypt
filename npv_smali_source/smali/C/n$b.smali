.class final LC/n$b;
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


# direct methods
.method constructor <init>(LV/G1;)V
    .locals 0

    iput-object p1, p0, LC/n$b;->D:LV/G1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC/j;
    .locals 2

    new-instance v0, LC/j;

    iget-object v1, p0, LC/n$b;->D:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/l;

    invoke-direct {v0, v1}, LC/j;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/n$b;->a()LC/j;

    move-result-object v0

    return-object v0
.end method
