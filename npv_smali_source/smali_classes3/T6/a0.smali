.class public final synthetic LT6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:Ljava/util/List;

.field public final synthetic D:LT6/g0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LT6/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/a0;->C:Ljava/util/List;

    iput-object p2, p0, LT6/a0;->D:LT6/g0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LT6/a0;->C:Ljava/util/List;

    iget-object v1, p0, LT6/a0;->D:LT6/g0;

    invoke-static {v0, v1}, LT6/g0;->g(Ljava/util/List;LT6/g0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
