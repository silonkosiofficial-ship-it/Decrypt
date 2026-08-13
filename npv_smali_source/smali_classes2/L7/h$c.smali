.class final LL7/h$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LL7/h;


# direct methods
.method constructor <init>(LL7/h;)V
    .locals 0

    iput-object p1, p0, LL7/h$c;->D:LL7/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ln8/c;
    .locals 2

    sget-object v0, LL7/j;->y:Ln8/c;

    iget-object v1, p0, LL7/h$c;->D:LL7/h;

    invoke-virtual {v1}, LL7/h;->n()Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v0

    const-string v1, "child(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL7/h$c;->a()Ln8/c;

    move-result-object v0

    return-object v0
.end method
