.class public final synthetic LT6/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:LT6/M;


# direct methods
.method public synthetic constructor <init>(LT6/M;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/S;->C:LT6/M;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT6/S;->C:LT6/M;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, LT6/T;->a(LT6/M;Ljava/lang/String;Ljava/util/List;)Li7/M;

    move-result-object p1

    return-object p1
.end method
