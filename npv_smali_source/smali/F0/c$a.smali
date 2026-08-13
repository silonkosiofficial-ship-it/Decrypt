.class final LF0/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/c;->V1(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/c;


# direct methods
.method constructor <init>(LF0/c;)V
    .locals 0

    iput-object p1, p0, LF0/c$a;->D:LF0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LF0/c$a;->D:LF0/c;

    invoke-virtual {v0}, LF0/c;->Z1()V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/c$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
