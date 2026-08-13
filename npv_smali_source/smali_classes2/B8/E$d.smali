.class final synthetic LB8/E$d;
.super Ly7/p;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/E;->t(LB8/E;Li8/q;I)LO7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LB8/E$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/E$d;

    invoke-direct {v0}, LB8/E$d;-><init>()V

    sput-object v0, LB8/E$d;->L:LB8/E$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/p;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "getOuterClassId"

    return-object v0
.end method

.method public final k()LF7/e;
    .locals 1

    const-class v0, Ln8/b;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/b;

    invoke-virtual {p0, p1}, LB8/E$d;->s(Ln8/b;)Ln8/b;

    move-result-object p1

    return-object p1
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    const-string v0, "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;"

    return-object v0
.end method

.method public final s(Ln8/b;)Ln8/b;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/b;->g()Ln8/b;

    move-result-object p1

    return-object p1
.end method
