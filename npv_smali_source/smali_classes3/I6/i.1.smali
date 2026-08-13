.class public final synthetic LI6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LW8/y;


# direct methods
.method public synthetic constructor <init>(LW8/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/i;->C:LW8/y;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI6/i;->C:LW8/y;

    invoke-static {v0}, LI6/h$b;->H(LW8/y;)Li7/M;

    move-result-object v0

    return-object v0
.end method
