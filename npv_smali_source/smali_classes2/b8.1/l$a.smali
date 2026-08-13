.class final Lb8/l$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/l;->N()Lb8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lb8/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/l$a;

    invoke-direct {v0}, Lb8/l$a;-><init>()V

    sput-object v0, Lb8/l$a;->D:Lb8/l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le8/q;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/s;->W()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le8/q;

    invoke-virtual {p0, p1}, Lb8/l$a;->a(Le8/q;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
