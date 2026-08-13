.class public final synthetic LC6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Lx7/l;

.field public final synthetic D:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/g;->C:Lx7/l;

    iput-object p2, p0, LC6/g;->D:Lx7/l;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LC6/g;->C:Lx7/l;

    iget-object v1, p0, LC6/g;->D:Lx7/l;

    invoke-static {v0, v1, p1}, LC6/j;->c(Lx7/l;Lx7/l;Ljava/lang/Object;)Li7/M;

    move-result-object p1

    return-object p1
.end method
