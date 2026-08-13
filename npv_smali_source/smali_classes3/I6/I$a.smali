.class final synthetic LI6/I$a;
.super Ly7/a;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final J:LI6/I$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI6/I$a;

    invoke-direct {v0}, LI6/I$a;-><init>()V

    sput-object v0, LI6/I$a;->J:LI6/I$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, LI6/G;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()LI6/G;
    .locals 7

    new-instance v6, LI6/G;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LI6/G;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILy7/k;)V

    return-object v6
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI6/I$a;->a()LI6/G;

    move-result-object v0

    return-object v0
.end method
