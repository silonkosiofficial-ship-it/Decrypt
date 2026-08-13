.class final synthetic LX7/x$a;
.super Ly7/p;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LX7/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/x$a;

    invoke-direct {v0}, LX7/x$a;-><init>()V

    sput-object v0, LX7/x$a;->L:LX7/x$a;

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

    const-string v0, "getDefaultReportLevelForAnnotation"

    return-object v0
.end method

.method public final k()LF7/e;
    .locals 2

    const-class v0, LX7/v;

    const-string v1, "compiler.common.jvm"

    invoke-static {v0, v1}, Ly7/P;->d(Ljava/lang/Class;Ljava/lang/String;)LF7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/c;

    invoke-virtual {p0, p1}, LX7/x$a;->s(Ln8/c;)LX7/G;

    move-result-object p1

    return-object p1
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    const-string v0, "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;"

    return-object v0
.end method

.method public final s(Ln8/c;)LX7/G;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LX7/v;->d(Ln8/c;)LX7/G;

    move-result-object p1

    return-object p1
.end method
