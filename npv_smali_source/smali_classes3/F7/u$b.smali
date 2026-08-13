.class final synthetic LF7/u$b;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF7/u;->h(Ljava/lang/reflect/Type;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LF7/u$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF7/u$b;

    invoke-direct {v0}, LF7/u$b;-><init>()V

    sput-object v0, LF7/u$b;->L:LF7/u$b;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "getComponentType()Ljava/lang/Class;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Ljava/lang/Class;

    const-string v3, "getComponentType"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p0, p1}, LF7/u$b;->s(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method
