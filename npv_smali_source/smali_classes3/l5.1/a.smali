.class public final synthetic Ll5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Ll4/m;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Ll4/b;


# direct methods
.method public synthetic constructor <init>(Ll4/m;Ljava/util/concurrent/atomic/AtomicBoolean;Ll4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5/a;->a:Ll4/m;

    iput-object p2, p0, Ll5/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll5/a;->c:Ll4/b;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll5/a;->a:Ll4/m;

    iget-object v1, p0, Ll5/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Ll5/a;->c:Ll4/b;

    invoke-static {v0, v1, v2, p1}, Ll5/b;->a(Ll4/m;Ljava/util/concurrent/atomic/AtomicBoolean;Ll4/b;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
