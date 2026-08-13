.class public final synthetic Lx9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Lx9/c0;


# direct methods
.method public synthetic constructor <init>(Lx9/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/b0;->C:Lx9/c0;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx9/b0;->C:Lx9/c0;

    check-cast p1, Lv9/a;

    invoke-static {v0, p1}, Lx9/c0;->f(Lx9/c0;Lv9/a;)Li7/M;

    move-result-object p1

    return-object p1
.end method
