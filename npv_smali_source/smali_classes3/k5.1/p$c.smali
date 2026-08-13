.class Lk5/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/p;->V()Ll4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk5/p;


# direct methods
.method constructor <init>(Lk5/p;)V
    .locals 0

    iput-object p1, p0, Lk5/p$c;->a:Lk5/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ll4/l;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lk5/p$c;->b(Ljava/lang/Void;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Void;)Ll4/l;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
