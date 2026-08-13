.class final LX0/n$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX0/n;->a(LX0/o;LX0/o;)LX0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LX0/o;


# direct methods
.method constructor <init>(LX0/o;)V
    .locals 0

    iput-object p1, p0, LX0/n$b;->D:LX0/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LX0/o;
    .locals 1

    iget-object v0, p0, LX0/n$b;->D:LX0/o;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX0/n$b;->a()LX0/o;

    move-result-object v0

    return-object v0
.end method
