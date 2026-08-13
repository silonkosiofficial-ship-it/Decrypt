.class final synthetic Laa/o$e;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:Laa/o$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/o$e;

    invoke-direct {v0}, Laa/o$e;-><init>()V

    sput-object v0, Laa/o$e;->L:Laa/o$e;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "getSystemEnvironment()Lorg/jetbrains/compose/resources/ResourceEnvironment;"

    const/4 v5, 0x1

    const/4 v1, 0x0

    const-class v2, Laa/p;

    const-string v3, "getSystemEnvironment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/o$e;->s()Laa/n;

    move-result-object v0

    return-object v0
.end method

.method public final s()Laa/n;
    .locals 1

    invoke-static {}, Laa/p;->a()Laa/n;

    move-result-object v0

    return-object v0
.end method
