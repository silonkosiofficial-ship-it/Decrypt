.class public final synthetic LY4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LY4/h;

.field public final synthetic D:Ll4/m;


# direct methods
.method public synthetic constructor <init>(LY4/h;Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY4/d;->C:LY4/h;

    iput-object p2, p0, LY4/d;->D:Ll4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LY4/d;->C:LY4/h;

    iget-object v1, p0, LY4/d;->D:Ll4/m;

    invoke-static {v0, v1}, LY4/h;->h(LY4/h;Ll4/m;)V

    return-void
.end method
