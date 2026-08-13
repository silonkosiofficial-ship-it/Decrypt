.class final synthetic Lv2/c$a$d;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$a;->V0()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:Lv2/c$a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/c$a$d;

    invoke-direct {v0}, Lv2/c$a$d;-><init>()V

    sput-object v0, Lv2/c$a$d;->L:Lv2/c$a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "inTransaction()Z"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lz2/d;

    const-string v3, "inTransaction"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-virtual {p0, p1}, Lv2/c$a$d;->s(Lz2/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lz2/d;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lz2/d;->V0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
