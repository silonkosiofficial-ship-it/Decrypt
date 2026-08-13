.class public final synthetic LK4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# instance fields
.field public final synthetic a:LK4/d;

.field public final synthetic b:Ll4/m;


# direct methods
.method public synthetic constructor <init>(LK4/d;Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK4/z;->a:LK4/d;

    iput-object p2, p0, LK4/z;->b:Ll4/m;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)V
    .locals 2

    iget-object v0, p0, LK4/z;->a:LK4/d;

    iget-object v1, p0, LK4/z;->b:Ll4/m;

    invoke-virtual {v0, v1, p1}, LK4/d;->u(Ll4/m;Ll4/l;)V

    return-void
.end method
