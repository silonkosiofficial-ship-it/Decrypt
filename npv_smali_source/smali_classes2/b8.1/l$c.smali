.class final Lb8/l$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/l;->t(Ly8/d;Lx7/l;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lb8/l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/l$c;

    invoke-direct {v0}, Lb8/l$c;-><init>()V

    sput-object v0, Lb8/l$c;->D:Lb8/l$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly8/h;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly8/h;->d()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly8/h;

    invoke-virtual {p0, p1}, Lb8/l$c;->a(Ly8/h;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
