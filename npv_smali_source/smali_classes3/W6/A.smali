.class public final synthetic LW6/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:LW6/B;


# direct methods
.method public synthetic constructor <init>(LW6/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/A;->C:LW6/B;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LW6/A;->C:LW6/B;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, LW6/B;->f(LW6/B;Ljava/lang/String;Ljava/util/List;)Li7/M;

    move-result-object p1

    return-object p1
.end method
