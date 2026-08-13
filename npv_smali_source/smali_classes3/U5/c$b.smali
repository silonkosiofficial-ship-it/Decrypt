.class final LU5/c$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/c;-><init>(Lm7/i;LG5/e;LS5/b;LU5/a;LM1/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM1/h;


# direct methods
.method constructor <init>(LM1/h;)V
    .locals 0

    iput-object p1, p0, LU5/c$b;->D:LM1/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LU5/g;
    .locals 2

    new-instance v0, LU5/g;

    iget-object v1, p0, LU5/c$b;->D:LM1/h;

    invoke-direct {v0, v1}, LU5/g;-><init>(LM1/h;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LU5/c$b;->a()LU5/g;

    move-result-object v0

    return-object v0
.end method
