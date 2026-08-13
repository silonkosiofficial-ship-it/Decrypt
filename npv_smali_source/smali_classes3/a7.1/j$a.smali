.class public final La7/j$a;
.super La7/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:La7/i;


# direct methods
.method public constructor <init>(La7/i;)V
    .locals 1

    const-string v0, "relativeTo"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La7/j;-><init>(Ly7/k;)V

    iput-object p1, p0, La7/j$a;->a:La7/i;

    return-void
.end method


# virtual methods
.method public final a()La7/i;
    .locals 1

    iget-object v0, p0, La7/j$a;->a:La7/i;

    return-object v0
.end method
