.class LR7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/a;-><init>(LE8/n;Ln8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/a;


# direct methods
.method constructor <init>(LR7/a;)V
    .locals 0

    iput-object p1, p0, LR7/a$b;->C:LR7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ly8/h;
    .locals 2

    new-instance v0, Ly8/f;

    iget-object v1, p0, LR7/a$b;->C:LR7/a;

    invoke-virtual {v1}, LR7/a;->M0()Ly8/h;

    move-result-object v1

    invoke-direct {v0, v1}, Ly8/f;-><init>(Ly8/h;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/a$b;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
