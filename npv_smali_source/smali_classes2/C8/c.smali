.class public final LC8/c;
.super LB8/p;
.source "SourceFile"

# interfaces
.implements LL7/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/c$a;
    }
.end annotation


# static fields
.field public static final Q:LC8/c$a;


# instance fields
.field private final P:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC8/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC8/c$a;-><init>(Ly7/k;)V

    sput-object v0, LC8/c;->Q:LC8/c$a;

    return-void
.end method

.method private constructor <init>(Ln8/c;LE8/n;LO7/G;Li8/m;Lj8/a;Z)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, LB8/p;-><init>(Ln8/c;LE8/n;LO7/G;Li8/m;Lk8/a;LD8/f;)V

    iput-boolean p6, p0, LC8/c;->P:Z

    return-void
.end method

.method public synthetic constructor <init>(Ln8/c;LE8/n;LO7/G;Li8/m;Lj8/a;ZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LC8/c;-><init>(Ln8/c;LE8/n;LO7/G;Li8/m;Lj8/a;Z)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "builtins package fragment for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/z;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
