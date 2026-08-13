.class public final synthetic LX4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LQ4/f;

.field public final synthetic D:Ll4/m;


# direct methods
.method public synthetic constructor <init>(LQ4/f;Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX4/a;->C:LQ4/f;

    iput-object p2, p0, LX4/a;->D:Ll4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LX4/a;->C:LQ4/f;

    iget-object v1, p0, LX4/a;->D:Ll4/m;

    invoke-static {v0, v1}, LX4/e;->e(LQ4/f;Ll4/m;)V

    return-void
.end method
