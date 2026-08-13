.class public final synthetic LF6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic C:Lx7/p;


# direct methods
.method public synthetic constructor <init>(Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6/q;->C:Lx7/p;

    return-void
.end method


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF6/q;->C:Lx7/p;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, LF6/t;->a(Lx7/p;Ljava/lang/String;Ljava/util/List;)Li7/M;

    move-result-object p1

    return-object p1
.end method
