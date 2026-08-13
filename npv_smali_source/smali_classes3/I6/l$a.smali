.class final synthetic LI6/l$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LI6/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI6/l$a;

    invoke-direct {v0}, LI6/l$a;-><init>()V

    sput-object v0, LI6/l$a;->L:LI6/l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, LI6/P;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI6/l$a;->s()LI6/P;

    move-result-object v0

    return-object v0
.end method

.method public final s()LI6/P;
    .locals 1

    new-instance v0, LI6/P;

    invoke-direct {v0}, LI6/P;-><init>()V

    return-object v0
.end method
